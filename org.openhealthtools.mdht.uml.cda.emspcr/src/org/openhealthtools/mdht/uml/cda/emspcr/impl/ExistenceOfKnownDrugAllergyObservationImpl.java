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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfKnownDrugAllergyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of Known Drug Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExistenceOfKnownDrugAllergyObservationImpl extends ObservationImpl implements ExistenceOfKnownDrugAllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfKnownDrugAllergyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownDrugAllergyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownDrugAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownDrugAllergyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownDrugAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownDrugAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfKnownDrugAllergyObservationOperations.validateExistenceOfKnownDrugAllergyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfKnownDrugAllergyObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExistenceOfKnownDrugAllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ExistenceOfKnownDrugAllergyObservationImpl
