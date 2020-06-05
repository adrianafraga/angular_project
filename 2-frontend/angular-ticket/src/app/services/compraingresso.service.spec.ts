import { TestBed } from '@angular/core/testing';

import { CompraingressoService } from './compraingresso.service';

describe('CompraingressoService', () => {
  let service: CompraingressoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CompraingressoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
