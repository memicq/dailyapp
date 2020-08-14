import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-preview',
  templateUrl: './preview.component.html',
  styleUrls: ['./preview.component.scss']
})
export class PreviewComponent implements OnInit {

  public text: string = "text".repeat(1000)

  constructor() { }

  ngOnInit(): void {
  }

}
