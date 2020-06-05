import { Injectable } from '@angular/core';
import { Casashow } from '../common/casashow';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CasashowService {

 //definindo a url de serviço
 private baseUrl = 'http://localhost:8081/api/casashows';

 //injetar o httpclient --injeção de dependências
 constructor(private httpClient: HttpClient) { }


   //método para obter a lista de eventos
   //vai mapear JSON doo serviço REST de dados para uma matriz de eventos, retorna a matriz observável do projeto
   getCasaShowList(): Observable<Casashow[]>{
     return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
       map(response => response._embedded.casashows)
     );
   }
}
 

 //essa interface ajudará a desembrulhar o JSON
 interface GetResponse{
   _embedded:{
     casashows : Casashow[];
   }
 }
 



