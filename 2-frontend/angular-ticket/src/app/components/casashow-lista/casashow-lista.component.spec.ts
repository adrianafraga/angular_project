import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CasashowListaComponent } from './casashow-lista.component';

describe('CasashowListaComponent', () => {
  let component: CasashowListaComponent;
  let fixture: ComponentFixture<CasashowListaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CasashowListaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CasashowListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
