import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditVenteComponent } from './edit-vente.component';

describe('EditVenteComponent', () => {
  let component: EditVenteComponent;
  let fixture: ComponentFixture<EditVenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditVenteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditVenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
