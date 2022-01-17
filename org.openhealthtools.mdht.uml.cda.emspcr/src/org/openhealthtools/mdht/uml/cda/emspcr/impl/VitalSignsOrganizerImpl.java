/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VitalSignsOrganizerImpl extends OrganizerImpl implements VitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerSystolicBloodPressureComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerSystolicBloodPressureComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerRespiratoryRateComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerRespiratoryRateComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBodyTemperatureComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerBodyTemperatureComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerOxygenSaturationComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerOxygenSaturationComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerComponent4(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponent4(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponent42(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerComponent43(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerComponent43(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //VitalSignsOrganizerImpl
