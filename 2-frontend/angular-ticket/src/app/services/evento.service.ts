import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Evento } from '../common/evento';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EventoService {

  //definindo a url de serviço
  private baseUrl = 'http://localhost:8081/api/eventoes';

  //injetar o httpclient --injeção de dependências
  constructor(private httpClient: HttpClient) { }


    //método para obter a lista de eventos
    //vai mapear JSON doo serviço REST de dados para uma matriz de eventos, retorna a matriz observável do projeto
    getEventoList(): Observable<Evento[]>{
      return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
        map(response => response._embedded.eventoes)
      );
    }
}
  

  //essa interface ajudará a desembrulhar o JSON
  interface GetResponse{
    _embedded:{
      eventoes : Evento[];
    }
  }
  



