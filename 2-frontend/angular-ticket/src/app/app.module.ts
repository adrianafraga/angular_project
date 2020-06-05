import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UsuariosListaComponent } from './components/usuarios-lista/usuarios-lista.component';
import { EventosListaComponent } from './components/eventos-lista/eventos-lista.component';
import { CasashowListaComponent } from './components/casashow-lista/casashow-lista.component';
import { CompraingressoListaComponent } from './components/compraingresso-lista/compraingresso-lista.component';
//import { EventosListaTabelaComponent } from './components/eventos-lista/eventos-lista-tabela.component';
import { HttpClientModule} from '@angular/common/http';

import { EventoService } from './services/evento.service';
import { CasashowService } from './services/casashow.service';
import { CompraingressoService } from './services/compraingresso.service';
import { UsuarioService } from './services/usuario.service';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { from } from 'rxjs';
import { HeaderComponent } from './components/header/header.component';
import { MatToolbarModule} from '@angular/material/toolbar';
import {FooterComponent} from './components/footer/footer.component';
import { NavComponent } from './components/nav/nav.component';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule} from '@angular/material/list';
import { MatCardModule} from '@angular/material/card';
import { HomeComponent } from './views/home/home.component';
import { routing } from './app.routing.module';




@NgModule({
  declarations: [
    AppComponent,
    UsuariosListaComponent,
    EventosListaComponent,
    CasashowListaComponent,
    CompraingressoListaComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    HomeComponent
  
    //EventosListaTabelaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    MatCardModule,
    routing,
  

  ],
  providers: [EventoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
