package service.impl;


import base.service.Impl.BaseEntityServiceImpl;
import entity.operation.Comment;
import repository.CommentRepository;
import service.CommentService;

public class CommentServiceImpl
        extends BaseEntityServiceImpl<Comment, Integer, CommentRepository>
        implements CommentService {


    public CommentServiceImpl(CommentRepository repository) {
        super(repository);
    }
}