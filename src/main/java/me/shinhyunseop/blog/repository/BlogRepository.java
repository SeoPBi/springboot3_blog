package me.shinhyunseop.blog.repository;

import me.shinhyunseop.blog.domain.Article;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
