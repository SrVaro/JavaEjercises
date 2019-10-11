import { TestBed } from '@angular/core/testing';

import { KittyServiceService } from './kitty-service.service';

describe('KittyServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: KittyServiceService = TestBed.get(KittyServiceService);
    expect(service).toBeTruthy();
  });
});
