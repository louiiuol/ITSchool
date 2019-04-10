package fr.formation.itschool.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Represents an address, defined by its id, road, zip code and city.
 */
@Entity
public class Address extends AbstractEntity {

    private static final long serialVersionUID = -8386797871708710195L;

    @Column(length = 100, nullable = false)
    private String road;

    @Column(length = 10, nullable = false)
    private String zipCode;

    @Column(length = 100, nullable = false)
    private String city;

    /*
     * Explicit protected constructor for ensuring security and consistency.
     */
    protected Address() {
	// Default no-arg empty constructor
    }

    /**
     * Returns a string representation of this {@code address}.
     * <p>
     * Returns a view of all the properties.
     *
     * @return a string representation of this {@code address}
     */
    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder("id=");
	sb.append(getId());
	sb.append(", road=");
	sb.append(road);
	sb.append(", zipCode=");
	sb.append(zipCode);
	sb.append(", city=");
	sb.append(city);
	return sb.toString();
    }
}
