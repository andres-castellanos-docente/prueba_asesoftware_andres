export class TurnosModel {
  fecha_ini: string;
  fecha_fin: string;
  id_servicio: string;

  constructor(json: any = null) {
    if (json !== null) {
      this.fecha_ini = json.fecha_ini;
      this.fecha_fin = json.fecha_fin;
      this.id_servicio = json.id_servicio;
    } else {
      this.fecha_ini = null;
      this.fecha_fin = null;
      this.id_servicio = null;
    }
  }
}
