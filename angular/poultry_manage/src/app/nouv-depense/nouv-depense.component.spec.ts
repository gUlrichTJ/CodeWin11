import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvDepenseComponent } from './nouv-depense.component';

describe('NouvDepenseComponent', () => {
  let component: NouvDepenseComponent;
  let fixture: ComponentFixture<NouvDepenseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NouvDepenseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NouvDepenseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
