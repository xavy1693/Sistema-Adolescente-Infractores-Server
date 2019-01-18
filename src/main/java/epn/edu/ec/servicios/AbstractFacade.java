package epn.edu.ec.servicios;

import java.util.List;
import javax.persistence.EntityManager;

public abstract class AbstractFacade<T> {

    private Class<T> entidadC;

    public AbstractFacade(Class<T> entidadC) {
        this.entidadC = entidadC;
    }

    protected abstract EntityManager getEntityManager();

    public T crear(T entidad) {
        getEntityManager().persist(entidad);
        return entidad;
    }

    public T editar(T entidad) {
        getEntityManager().merge(entidad);
        return entidad;
    }

    public void eliminar(T entidad) {
        getEntityManager().remove(getEntityManager().merge(entidad));
    }

    public T buscarPorId(Object id) {
        return getEntityManager().find(entidadC, id);
    }

    public List<T> listarTodo() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entidadC));
        return getEntityManager().createQuery(cq).getResultList();
    }

    
}
