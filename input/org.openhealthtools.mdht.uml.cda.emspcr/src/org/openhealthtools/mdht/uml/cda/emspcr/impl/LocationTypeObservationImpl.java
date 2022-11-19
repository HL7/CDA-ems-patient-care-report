/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.LocationTypeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LocationTypeObservationImpl extends ObservationImpl implements LocationTypeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.LOCATION_TYPE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LocationTypeObservationOperations.validateLocationTypeObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LocationTypeObservationOperations.validateLocationTypeObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LocationTypeObservationOperations.validateLocationTypeObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LocationTypeObservationOperations.validateLocationTypeObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTypeObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LocationTypeObservationOperations.validateLocationTypeObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTypeObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LocationTypeObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // LocationTypeObservationImpl
