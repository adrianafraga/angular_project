import { Component, OnInit } from '@angular/core';
import { Compraingresso } from 'src/app/common/compraingresso';
import { CompraingressoService } from 'src/app/services/compraingresso.service';

@Component({
  selector: 'app-compraingresso-lista',
  templateUrl: './compraingresso-lista.component.html',
  styleUrls: ['./compraingresso-lista.component.css']
})
export class CompraingressoListaComponent implements OnInit {

  compraingressoes: Compraingresso[];


  //injetar uma dependência do Evento.Service
  constructor(private compraingressoService: CompraingressoService) { }

  ngOnInit() {//adicionar o gancho para o 
    this.listCompraIngressos(); //método lista eventos
  }

  listCompraIngressos(){ //definição do método
    this.compraingressoService.getCompraingressoList().subscribe(
      data => {
        this.compraingressoes = data; //resultados da gama de ingressos array
        
      }

    )

  }

}