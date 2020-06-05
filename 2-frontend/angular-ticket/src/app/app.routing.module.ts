
import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { from } from 'rxjs';
import { UsuariosListaComponent } from './components/usuarios-lista/usuarios-lista.component';
import { HomeComponent } from './views/home/home.component';
import { CasashowListaComponent } from './components/casashow-lista/casashow-lista.component';
import { EventosListaComponent } from './components/eventos-lista/eventos-lista.component';
import { CompraingressoListaComponent } from './components/compraingresso-lista/compraingresso-lista.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { NavComponent } from './components/nav/nav.component';


const routes: Routes = [

    //{path: '', component: HeaderComponent},
    //{path: '', component: FooterComponent},
    {path: '', component: HomeComponent},
    //{path: '', component: NavComponent},
    {path: 'usuarios' , component: UsuariosListaComponent},
    {path: 'casashows' , component: CasashowListaComponent},
    {path: 'eventoes' , component: EventosListaComponent},
    {path: 'compraingressoes' , component: CompraingressoListaComponent},

];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes);