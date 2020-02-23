import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { AppComponent } from "./app.component";
import { HomePageComponent } from "./home-page/home-page.component";
import { PostComponent } from "./post/post.component";
import { RouterModule, Routes } from "@angular/router";
import { NotFoundComponent } from "./not-found/not-found.component";
import { PostPageComponent } from "./post-page/post-page.component";
import { RecentPostsComponent } from "./recent-posts/recent-posts.component";
import { AboutPageComponent } from "./about-page/about-page.component";
import { HttpClientModule } from "@angular/common/http";
import { PostWritingComponent } from "./post-writing/post-writing.component";
import { PostFormComponent } from "./post-form/post-form.component";
import { ReactiveFormsModule } from "@angular/forms";

const appRoutes: Routes = [
  { path: "home", component: HomePageComponent },
  { path: "posts/edit", component: PostWritingComponent },
  { path: "posts/add", component: PostWritingComponent },
  { path: "post/:id", component: PostPageComponent },
  { path: "about", component: AboutPageComponent },
  { path: "", redirectTo: "/home", pathMatch: "full" },
  { path: "**", component: NotFoundComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    PostPageComponent,
    AboutPageComponent,
    PostComponent,
    NotFoundComponent,
    RecentPostsComponent,
    PostFormComponent,
    PostWritingComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(appRoutes, { anchorScrolling: "enabled" })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
