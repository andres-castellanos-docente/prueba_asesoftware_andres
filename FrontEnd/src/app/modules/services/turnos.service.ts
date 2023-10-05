import {Injectable, SkipSelf} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../environments/environment';
import {UsuariosModel} from '../models/usuarios.model';
import {TurnosModel} from '../models/turnos.model';

@Injectable({
  providedIn: 'root'
})
export class TurnosService {

  constructor(@SkipSelf() private http: HttpClient) {
  }

  path = 'comercios';

  listarUsuarios(): Observable<any> {
    return this.http.get(environment.apiUrl + this.path, {});
  }


  listarComercios(): Observable<any> {
    return this.http.get(environment.apiUrl + this.path, {});
  }

  listarServicios(idComerc: number): Observable<any> {
    const pathLocal = 'serviciosbyComercio/' + idComerc.toString();
    return this.http.get(environment.apiUrl + pathLocal, {});
  }

  genTurnos(request: TurnosModel): Observable<any> {
   debugger;
    const pathLocal = 'turnos' ;
    return this.http.post(environment.apiUrl + pathLocal, request, {});
  }

  editarUsuario(request: UsuariosModel): Observable<any> {
    return this.http.put(environment.apiUrl + this.path + '/' + request.id.toString(), request, {});
  }

  eliminarUsuario(idElim: number): Observable<any> {
    return this.http.delete(environment.apiUrl + this.path + '/' + idElim.toString(), {});
  }

}
