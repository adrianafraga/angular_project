import { Component, OnInit } from '@angular/core';
import { CasashowService } from 'src/app/services/casashow.service';
import { Casashow } from 'src/app/common/casashow';

@Component({
  selector: 'app-casashow-lista',
  templateUrl: './casashow-lista.component.html',
  styleUrls: ['./casashow-lista.component.css']
})
export class CasashowListaComponent implements OnInit {

  
casashows: Casashow[];

//injetar uma dependência do Evento.Service
constructor(private casashowService: CasashowService) { }

ngOnInit() {//adicionar o gancho para o 
  this.listCasaShows(); //método lista eventos
}
  

listCasaShows(){ //definição do método
  this.casashowService.getCasaShowList().subscribe(
    data => {
      this.casashows = data; //resultados da gama de ingressos array
      
    }

  )

}

}
