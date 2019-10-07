package app;

/**
 * Component
 */
public abstract class Component {

    Mediator mediator;

    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();

    /**
     * @param mediator the mediator to set
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
