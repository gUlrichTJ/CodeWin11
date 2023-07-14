import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvOeufComponent } from './nouv-oeuf.component';

describe('NouvOeufComponent', () => {
  let component: NouvOeufComponent;
  let fixture: ComponentFixture<NouvOeufComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NouvOeufComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NouvOeufComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
