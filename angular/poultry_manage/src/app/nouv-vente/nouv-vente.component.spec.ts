import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvVenteComponent } from './nouv-vente.component';

describe('NouvVenteComponent', () => {
  let component: NouvVenteComponent;
  let fixture: ComponentFixture<NouvVenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NouvVenteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NouvVenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
