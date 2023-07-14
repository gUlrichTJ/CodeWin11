import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvPouleComponent } from './nouv-poule.component';

describe('NouvPouleComponent', () => {
  let component: NouvPouleComponent;
  let fixture: ComponentFixture<NouvPouleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NouvPouleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NouvPouleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
