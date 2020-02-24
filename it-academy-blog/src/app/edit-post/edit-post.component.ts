import { Component, OnInit } from '@angular/core';
import { PostsService } from '../services/posts.service';
import { FormBuilder, Validators } from '@angular/forms';
import { Post } from '../shared/post';
import { ActivatedRoute } from '@angular/router';
import { from, Observable } from 'rxjs';
import { switchMap, tap } from 'rxjs/operators';

@Component({
  selector: 'app-edit-post',
  templateUrl: './edit-post.component.html',
  styleUrls: ['./edit-post.component.scss']
})
export class EditPostComponent implements OnInit {

  constructor(private postsService: PostsService, private fb: FormBuilder, private route: ActivatedRoute) {}
  public post: Post;
  public id: number;
  serverErrorMessage: string;

postForm = this.fb.group({
  author: ['', [
    Validators.required
  ]],
  content: ['', [
    Validators.required
  ]],
  email: ['', [
    Validators.required,
    Validators.maxLength(30),
    Validators.pattern("[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$")
  ]],
  title: ['', [
    Validators.required,
    Validators.maxLength(30),
    Validators.minLength(3)
  ]],
});

  

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.id = +params['id']; // (+) converts string 'id' to a number         
      console.log(this.id);
    });
    this.post = { author: "", content: "", email: "", title: "" };
  }


  onSubmit() {
    
    this.post = this.postForm.value;
    this.postsService.updatePost(this.id, this.post).subscribe(() => {
      this.post = { author: "", content: "", email: "", title: "" };
      this.serverErrorMessage = '';
    },
      error => this.serverErrorMessage = error
    );
  }

get author(){
    return this.postForm.get('author');
  }
  get content(){
    return this.postForm.get('content');
  }
  get email(){
    return this.postForm.get('email');
  }
  get title(){
    return this.postForm.get('title');
  }
}
