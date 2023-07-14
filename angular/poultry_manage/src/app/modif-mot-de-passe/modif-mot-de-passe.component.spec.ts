import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifMotDePasseComponent } from './modif-mot-de-passe.component';

describe('ModifMotDePasseComponent', () => {
  let component: ModifMotDePasseComponent;
  let fixture: ComponentFixture<ModifMotDePasseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModifMotDePasseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModifMotDePasseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
