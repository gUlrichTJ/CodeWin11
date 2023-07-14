import { TestBed } from '@angular/core/testing';

import { PouleService } from './poule.service';

describe('PouleService', () => {
  let service: PouleService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PouleService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
