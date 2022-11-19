import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Factura } from '../Modelo/Factura';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }
  
  getPersonas(){
    return this.http.get<Factura[]>(`${environment.apiUrl}/factura/`);
  }
  createFactura(factura:Factura){
    return this.http.post<Factura>(`${environment.apiUrl}/factura/`, factura);
  }

  getPersonaId(id:number){
    return this.http.get<Factura>(`${environment.apiUrl}/factura/${id}`)
  }

  updatePersona(factura:Factura){
    return this.http.put<Factura>(`${environment.apiUrl}/factura/${factura.id}`,factura)
  }

  deletePersona(factura:Factura){
    return this.http.delete<Factura>(`${environment.apiUrl}/factura/${factura.id}`);
  }

}
