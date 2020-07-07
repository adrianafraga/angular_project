import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EventoInserirComponent } from './evento-inserir.component';

describe('EventoInserirComponent', () => {
  let component: EventoInserirComponent;
  let fixture: ComponentFixture<EventoInserirComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EventoInserirComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EventoInserirComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
