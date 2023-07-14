import { TestBed } from '@angular/core/testing';

import { OeufService } from './oeuf.service';

describe('OeufService', () => {
  let service: OeufService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OeufService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
