import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EditorComponent } from './editor/editor.component';
import { PageNotFoundComponent } from './error/page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { InputEditorComponent } from './editor/input-editor/input-editor.component';
import { PreviewComponent } from './editor/preview/preview.component';

@NgModule({
  declarations: [
    AppComponent,
    EditorComponent,
    PageNotFoundComponent,
    HeaderComponent,
    FooterComponent,
    InputEditorComponent,
    PreviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
