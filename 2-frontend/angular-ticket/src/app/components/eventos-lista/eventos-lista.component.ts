import { Component, OnInit } from '@angular/core';
import { EventoService } from 'src/app/services/evento.service';
import { Evento } from 'src/app/common/evento';

@Component({
  selector: 'app-eventos-lista',
  templateUrl: './eventos-lista-tabela.component.html',
  //templateUrl: './eventos-lista.component.html',
  styleUrls: ['./eventos-lista.component.css']
})
export class EventosListaComponent implements OnInit {

  eventoes: Evento[];

  //injetar uma dependência do Evento.Service
  constructor(private eventoService: EventoService) { }

  ngOnInit() {//adicionar o gancho para o 
    this.listEventos(); //método lista eventos
  }

  listEventos(){ //definição do método
    this.eventoService.getEventoList().subscribe(
      data => {
        this.eventoes = data; //resultados da gama de ingressos array
        
      }

    )

  }

}
