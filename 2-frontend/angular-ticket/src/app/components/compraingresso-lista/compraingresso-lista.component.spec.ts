import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompraingressoListaComponent } from './compraingresso-lista.component';

describe('CompraingressoListaComponent', () => {
  let component: CompraingressoListaComponent;
  let fixture: ComponentFixture<CompraingressoListaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompraingressoListaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompraingressoListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
