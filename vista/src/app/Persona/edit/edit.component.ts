import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Factura } from 'src/app/Modelo/Factura';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  modelFactura: Factura=new Factura();
  constructor(private service:ServiceService,private router:Router) { }

  ngOnInit(): void {
    this.Editar();
  }

  Editar(){
    let id=localStorage.getItem("id");
    this.service.getPersonaId(+id!)
    .subscribe(data=>{
      this.modelFactura=data;
    })

  }

  Actualizar(persona:Factura){
    this.service.updatePersona(persona)
    .subscribe(data=>{
      this.modelFactura=data
      alert("Factura actualizada correctamente")
      this.router.navigate(["listar"]);
    })
  }

}
