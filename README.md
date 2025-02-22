# Playground

## Changelog

## 22 February 2025
- Correct variable names in `PostController.java`
- Fix bug in `PostService.java` for updating a post; missing utilisation of `postRepository` and calling `save` to update corresponding entity in database
- Add date processing for `modifiedAt` when a post is being updated

### 19 February 2025
- Update return types of methods in `PostController.java` to control response status codes

### 18 February 2025
- Add support for `PATCH` HTTP requests

### 17 February 2025
- Set up basic backend application
  - Added basic implementation for Post domain