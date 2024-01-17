package repository.impl;

import base.reposiotry.Impl.BaseEntityRepositoryImpl;
import entity.operation.Comment;
import repository.CommentRepository;

import javax.persistence.EntityManager;

public class CommentRepositoryImpl
        extends BaseEntityRepositoryImpl<Comment, Integer>
        implements CommentRepository {


    public CommentRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Comment> getEntityClass() {
        return Comment.class;
    }
}
