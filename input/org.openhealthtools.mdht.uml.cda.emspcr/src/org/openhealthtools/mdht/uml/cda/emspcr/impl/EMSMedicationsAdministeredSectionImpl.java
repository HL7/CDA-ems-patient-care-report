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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSMedicationsAdministeredSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Medications Administered Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSMedicationsAdministeredSectionImpl extends SectionImpl implements EMSMedicationsAdministeredSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSMedicationsAdministeredSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSMedicationsAdministeredSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSMedicationsAdministeredSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSMedicationsAdministeredSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSMedicationsAdministeredSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSMedicationsAdministeredSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSMedicationsAdministeredSectionMedicationAdministered(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSMedicationsAdministeredSectionOperations.validateEMSMedicationsAdministeredSectionMedicationAdministered(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationAdministered> getMedicationAdministereds() {
		return EMSMedicationsAdministeredSectionOperations.getMedicationAdministereds(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSMedicationsAdministeredSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSMedicationsAdministeredSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSMedicationsAdministeredSectionImpl
