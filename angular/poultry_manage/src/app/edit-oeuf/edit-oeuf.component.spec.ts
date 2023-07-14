import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditOeufComponent } from './edit-oeuf.component';

describe('EditOeufComponent', () => {
  let component: EditOeufComponent;
  let fixture: ComponentFixture<EditOeufComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditOeufComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditOeufComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
