import { NgModule } from '@angular/core';
import { ModulosextRoutingModule } from './modulosext-routing.module';
import { HomeComponent } from './formas/home/home.component';
import {SharedModule} from '../SharedModule';
import { TurnosComponent } from './formas/turnos/turnos.component';
import {TurnosService} from './services/turnos.service';
import {DialogMessagesComponent} from './formas/turnos/diagmessages.component';
import {ReplacePipe} from './pipes/ReplacePipe';

@NgModule({
  imports: [
    ModulosextRoutingModule,
    SharedModule
  ],
  declarations: [
    HomeComponent,
    TurnosComponent,
    DialogMessagesComponent,
    ReplacePipe
  ],
  entryComponents: [],
  providers: [ TurnosService ]
})
export class ModulosextModule { }
