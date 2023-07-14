import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'poultry_manage';
  showSidebar = true;
  
  toggleSidebar() {
    this.showSidebar = !this.showSidebar;
  }
  
 
}
