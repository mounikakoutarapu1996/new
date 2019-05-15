import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'JavaSampleApproach';
  description = 'Angular-SpringBoot';

  readLocalStorageValue(key) {
    return localStorage.getItem(key);
}
logout(){
  localStorage.setItem('Role','nothing');
  localStorage.setItem('loginmsg','nothing');
  localStorage.setItem('uname','nothing');
}
}
