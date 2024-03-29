/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCurrentMedicationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Current Medication Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSCurrentMedicationSectionImpl extends SectionImpl implements EMSCurrentMedicationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSCurrentMedicationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_CURRENT_MEDICATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionCurrentlyOnMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCurrentlyOnMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCurrentMedicationSectionCurrentMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCurrentMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentlyOnMedication getCurrentlyOnMedication() {
		return EMSCurrentMedicationSectionOperations.getCurrentlyOnMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrentMedication> getCurrentMedications() {
		return EMSCurrentMedicationSectionOperations.getCurrentMedications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCurrentMedicationSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSCurrentMedicationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSCurrentMedicationSectionImpl
