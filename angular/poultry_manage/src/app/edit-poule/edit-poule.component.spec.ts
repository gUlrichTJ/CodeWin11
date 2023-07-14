import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditPouleComponent } from './edit-poule.component';

describe('EditPouleComponent', () => {
  let component: EditPouleComponent;
  let fixture: ComponentFixture<EditPouleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditPouleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditPouleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
