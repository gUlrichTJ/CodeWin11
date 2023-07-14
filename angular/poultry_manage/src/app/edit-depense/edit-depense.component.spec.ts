import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditDepenseComponent } from './edit-depense.component';

describe('EditDepenseComponent', () => {
  let component: EditDepenseComponent;
  let fixture: ComponentFixture<EditDepenseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditDepenseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditDepenseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
