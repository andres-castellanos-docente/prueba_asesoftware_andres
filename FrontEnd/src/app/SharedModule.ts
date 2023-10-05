import { NgModule } from '@angular/core';
import {AppMaterialModule} from './app.material.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  imports:      [ AppMaterialModule,   ReactiveFormsModule,
    FormsModule, HttpClientModule, CommonModule],
  declarations: [  ],
  exports:      [
    AppMaterialModule,   ReactiveFormsModule,
    FormsModule,  HttpClientModule,     CommonModule]
})
export class SharedModule { }
