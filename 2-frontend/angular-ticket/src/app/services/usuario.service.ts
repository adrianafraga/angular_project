import { Injectable } from '@angular/core';
import { Usuario } from '../common/usuario';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  

 //definindo a url de serviço
 private baseUrl = 'http://localhost:8081/api/usuarios';

 //injetar o httpclient --injeção de dependências
 constructor(private httpClient: HttpClient) { }


   //método para obter a lista de eventos
   //vai mapear JSON doo serviço REST de dados para uma matriz de eventos, retorna a matriz observável do projeto
   getUsuarioList(): Observable<Usuario[]>{
     return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
       map(response => response._embedded.usuarios)
     );
   }
}
 

 //essa interface ajudará a desembrulhar o JSON
 interface GetResponse{
   _embedded:{
     usuarios : Usuario[];
   }
 }
 



