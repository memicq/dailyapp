import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-input-editor',
  templateUrl: './input-editor.component.html',
  styleUrls: ['./input-editor.component.scss']
})
export class InputEditorComponent implements OnInit {

  public text: string = "text".repeat(1000)

  constructor() { }

  ngOnInit(): void {
  }

}
