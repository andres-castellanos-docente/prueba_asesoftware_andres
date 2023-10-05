import {Component, OnInit, ViewChild} from '@angular/core';
import {subirAnimation} from '../../../animations/listanim.animations';
import {MatTableDataSource} from '@angular/material/table';
import {MatPaginator} from '@angular/material/paginator';
import {AppCargandoService} from '../../../appBase/cargando/app.cargando.service';
import {TurnosService} from '../../services/turnos.service';
import {UsuariosModel} from '../../models/usuarios.model';
import {MatDialog} from '@angular/material/dialog';
import {MatSelectChange} from '@angular/material/select';
import {TurnosModel} from '../../models/turnos.model';
import {MatDatepickerInputEvent} from '@angular/material/datepicker';
import {DatePipe} from '@angular/common';

@Component({
  selector: 'app-turnos',
  templateUrl: './turnos.component.html',
  styleUrls: ['./turnos.component.scss'],
  animations: [subirAnimation]
})
export class TurnosComponent implements OnInit {
  dataUsuarios: UsuariosModel[];
  dataComercios: any[];
  dataServicios: any[];
  dataSource: MatTableDataSource<UsuariosModel>;
  displayedColumns: string[] = [  'NOM_COMERCIO', 'NOM_SERVICIO',  'FECHA_TURNO', 'HORA_INICIO', 'HORA_FIN'];
  @ViewChild(MatPaginator) paginator: MatPaginator;
  indexElEd: number;
  foods: any;
  private comercSel: any;
  private servicioSel: any;
  fechaini: any;
  fechafin: any;
  formSubmited: boolean;
  maxIni: Date;
  maxFin: Date;

  constructor(private usuariosService: TurnosService, private cargServ: AppCargandoService, public dialog: MatDialog) {
    this.maxIni = new Date(new Date().getFullYear() + 1, 12, 31);
    this.maxFin = new Date(new Date().getFullYear() + 1, 12, 31);
  }

  ngOnInit(): void {
    this.cargServ.iniciarCargando();

    this.usuariosService.listarUsuarios().subscribe((res: Response) => {
      this.dataUsuarios = res as any;
      this.dataSource = new MatTableDataSource<UsuariosModel>(this.dataUsuarios);
      this.dataSource.paginator = this.paginator;
      this.cargServ.detenCargando();
    });

    this.usuariosService.listarComercios().subscribe((res: Response) => {

      this.dataComercios = (res as any).comercios;

      this.cargServ.detenCargando();
    });


  }



  cambiarComerc($event: MatSelectChange): void {
    this.cargServ.iniciarCargando();
    this.comercSel = $event.value;
    this.usuariosService.listarServicios($event.value).subscribe((res: Response) => {
      this.dataServicios = (res as any).servicios;
      this.cargServ.detenCargando();
    });

  }

  cambiarServicio($event: MatSelectChange): void {
    this.servicioSel = $event.value;

  }

  genTurnos(): void {
    this.cargServ.iniciarCargando();
    const turn: TurnosModel = new TurnosModel(null);
    debugger;
    turn.fecha_ini = this.fechaini;
    turn.id_servicio = this.servicioSel;
    turn.fecha_fin = this.fechafin;
    debugger;
    this.usuariosService.genTurnos(turn).subscribe((res: Response) => {
      debugger;
      this.dataUsuarios = res as any;
      this.dataSource = new MatTableDataSource<UsuariosModel>(this.dataUsuarios);
      this.dataSource.paginator = this.paginator;
      this.cargServ.detenCargando();
    });
  }

  IniDateChange($event: MatDatepickerInputEvent<any, any>): void {
    this.fechaini = this.convertDate($event.value);
  }

  FinDateChange($event: MatDatepickerInputEvent<any, any>): void {
    this.fechafin = this.convertDate($event.value);
  }
  convertDate(value): string{
    const datepipe: DatePipe = new DatePipe('en-US');
    return  datepipe.transform(value, 'dd/MM/YYYY');
  }
}
