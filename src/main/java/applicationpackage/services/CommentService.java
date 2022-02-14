package applicationpackage.services;

import applicationpackage.data.Comment;
import applicationpackage.data.Product;
import applicationpackage.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;


    public List<Comment> getCommentsByProduct(Product product){
       return commentRepository.getAllCommentsByProductId(product.getId());
    }


    public void createComment(Comment comment){
        commentRepository.save(comment);
    }

}
