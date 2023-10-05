import { NgModule } from '@angular/core';
import { ModulosextRoutingModule } from './modulosext-routing.module';
import { HomeComponent } from './formas/home/home.component';
import {SharedModule} from '../SharedModule';
import { TurnosComponent } from './formas/turnos/turnos.component';
import {UsuariosService} from './services/usuarios.service';
import {DialogMessagesComponent} from './formas/turnos/diagmessages.component';
import {DialogConfElimComponent} from './formas/turnos/diagconfelim.component';
import { DialogCreatUsuariosComponent } from './formas/turnos/dialog-creat-usuarios/dialog-creat-usuarios.component';

@NgModule({
  imports: [
    ModulosextRoutingModule,
    SharedModule
  ],
  declarations: [
    HomeComponent,
    TurnosComponent,
    DialogMessagesComponent,
    DialogConfElimComponent,
    DialogCreatUsuariosComponent
  ],
  entryComponents: [],
  providers: [ UsuariosService ]
})
export class ModulosextModule { }
