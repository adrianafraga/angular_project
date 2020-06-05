import { Component, OnInit } from '@angular/core';

import { Usuario } from 'src/app/common/usuario';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-usuarios-lista',
  templateUrl: './usuarios-lista.component.html',
  styleUrls: ['./usuarios-lista.component.css']
})
export class UsuariosListaComponent implements OnInit {

  usuarios: Usuario[];

  //injetar uma dependência do Evento.Service
  constructor(private usuarioService: UsuarioService) { }

  ngOnInit() {//adicionar o gancho para o 
    this.listUsuarios(); //método lista eventos
  }

  listUsuarios(){ //definição do método
    this.usuarioService.getUsuarioList().subscribe(
      data => {
        this.usuarios = data; //resultados da gama de ingressos array
        
      }

    )

  }

}