import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Factura } from 'src/app/Modelo/Factura';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  modelFactura = new Factura();

  constructor(private service:ServiceService,private router:Router) { }

  ngOnInit(): void {
  }

  guardar(persona:Factura){
    try {
      this.service.createFactura(persona)
      .subscribe(data=>{
        alert("Factura guardada con exito");
        this.router.navigate(["listar"]);
      })
    } catch (error) {
      alert("Error al guardar factura "+error);
    }

  }

}
