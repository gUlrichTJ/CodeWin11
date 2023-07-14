import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PouleComponent } from './poule.component';

describe('PouleComponent', () => {
  let component: PouleComponent;
  let fixture: ComponentFixture<PouleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PouleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PouleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
