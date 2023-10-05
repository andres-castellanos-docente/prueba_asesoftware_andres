import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from './formas/home/home.component';
import {TurnosComponent} from './formas/turnos/turnos.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent, canActivate: []},
  {path: 'turnos', component: TurnosComponent, canActivate: []},
  {path: '', redirectTo: 'home', pathMatch: 'full', canActivate: []}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ModulosextRoutingModule {
}
